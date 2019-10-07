package com.cdc.data;

import android.content.Context;

import androidx.annotation.NonNull;

import com.cdc.data.source.TasksRepository;
import com.cdc.data.source.local.TasksLocalDataSource;
import com.cdc.data.source.local.ToDoDatabase;
import com.cdc.util.AppExecutors;

import static com.google.common.base.Preconditions.checkNotNull;

public class Injection {

    public static TasksRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        ToDoDatabase database = ToDoDatabase.getInstance(context);
        return TasksRepository.getInstance(FakeTasksRemoteDataSource.getInstance(),
                TasksLocalDataSource.getInstance(new AppExecutors(),
                        database.taskDao()));
    }
}
