/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.androidide.actions.editor.find

import android.view.MenuItem
import com.itsaky.androidide.actions.ActionData
import com.itsaky.androidide.actions.ActionItem.Location
import com.itsaky.androidide.actions.ActionItem.Location.EDITOR_SEARCH_ACTION_MODE
import com.itsaky.androidide.actions.EditorRelatedAction

/** @author Akash Yadav */
abstract class SearchActionModeAction : EditorRelatedAction() {
  override var location: Location = EDITOR_SEARCH_ACTION_MODE
  
  override fun getShowAsActionFlags(data: ActionData): Int {
    return MenuItem.SHOW_AS_ACTION_IF_ROOM
  }
}
