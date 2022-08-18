package peterbach1997.example.tasktimer

object TasksContract {
    internal const val TABLE_NAME = "Tasks"

    //    Tasks fields
    object Columns {
        const val ID = "_id"
        const val TASK_NAME = "Name"
        const val TASK_DESCRIPTION = "Description"
        const val SORT_ORDER = "SortOrder"

    }
}