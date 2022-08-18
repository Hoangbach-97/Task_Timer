package peterbach1997.example.tasktimer

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

//const val ID = "_id"
//const val TASK_NAME = "Name"
//const val TASK_DESCRIPTION = "Description"
//const val SORT_ORDER = "SortOrder"

private const val TAG = "AppDatabase"
private const val DATABASE_NAME ="TaskTimer.db"
private const val DATABASE_VERSION = 1

internal class AppDatabase private constructor(context:Context) : SQLiteOpenHelper(context, DATABASE_NAME,null, DATABASE_VERSION) {
    init {
        Log.d(TAG, "AppDatabase: initialising ")
    }
    override fun onCreate(db: SQLiteDatabase?) {
        Log.d(TAG, "onCreate: starts")
        val sSQL = """
            CREATE TABLE ${TasksContract.TABLE_NAME}(
            ${TasksContract.Columns.ID} INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
            ${TasksContract.Columns.TASK_NAME} TEXT NOT NULL,
            ${TasksContract.Columns.TASK_DESCRIPTION} TEXT,
            ${TasksContract.Columns.SORT_ORDER} INTEGER
            )
        """.trimIndent()
        Log.d(TAG, "onCreate:$sSQL")
        db?.execSQL(sSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        Log.d(TAG, "onUpgrade: start")
        when(oldVersion) {
            1 -> {

            }
            else-> throw IllegalArgumentException("onUpgrade with unknown newVersion: $newVersion")
        }
    }

    companion object : SingletonHolder<AppDatabase, Context>(::AppDatabase)
//    companion object {
//
//         @Volatile
//         private var instance:AppDatabase? = null
//
//        fun getInstance(context: Context):AppDatabase = instance?: synchronized(this) {
//            instance?:AppDatabase(context).also { instance = it }
//        }
//    }
}