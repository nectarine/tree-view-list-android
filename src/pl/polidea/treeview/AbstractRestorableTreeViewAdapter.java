package pl.polidea.treeview;

import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;

/**
 * Adapter used to feed the table view.
 *
 * @param <T> class for ID of the tree
 */
public abstract class AbstractRestorableTreeViewAdapter<T> extends AbstractTreeViewAdapter<T> implements
        ListAdapter {

    public AbstractRestorableTreeViewAdapter(Activity activity, TreeStateManager<T> treeStateManager, int numberOfLevels) {
        super(activity, treeStateManager, numberOfLevels);
    }

    @SuppressWarnings("unchecked")
    public void handleItemClick(final View view, final Object id) {
        expandCollapseWithPreviousState((T) id);
    }

    protected void expandCollapseWithPreviousState(final T id) {
        final TreeNodeInfo<T> info = treeStateManager.getNodeInfo(id);
        if (!info.isWithChildren()) {
            // ignore - no default action
            return;
        }
        if (info.isExpanded()) {
            treeStateManager.collapseChildren(id);
        } else {
            treeStateManager.expandChildrenWithPreviousState(id);
        }
    }
}
