tree-view-list-android
======================

Tree Component for Android.  Adapted from Google Code.  http://code.google.com/p/tree-view-list-android/

Additional feature
==================

**CAUTION**
When I faced on this tree-list-view, complicate tree-list-view elemets were not working properly when they are reused.
So, I **REMOVED REUSABILITY OF VIEWS** a.k.a dummy way
 

**AbstractRestorableTreeViewAdapter**
Original tree list view cannot restore expansion state of children.
extends AbstractRestorableTreeViewAdapter will do that job for you
