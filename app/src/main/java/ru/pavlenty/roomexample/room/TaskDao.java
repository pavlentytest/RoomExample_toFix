package ru.pavlenty.roomexample.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import io.reactivex.Flowable;


//CRUD operations
// Create Read Update Delete

@Dao
// Data access object
public interface TaskDao {

    @Query("SELECT * FROM task")
    Flowable<List<Task>> getAll();

    @Insert
    void insert(Task t);

    @Delete
    void delete(Task t);

    @Update
    void update(Task t);
}