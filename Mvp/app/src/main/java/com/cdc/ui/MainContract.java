package com.cdc.ui;

import androidx.annotation.NonNull;

import com.cdc.BasePresenter;
import com.cdc.BaseView;
import com.cdc.data.Task;
import com.cdc.tasks.TasksContract;
import com.cdc.tasks.TasksFilterType;

import java.util.List;

public interface MainContract {
    interface View extends BaseView<TasksContract.Presenter> {

        void setLoadingIndicator(boolean active);

        void showTaskDetailsUi(String taskId);

        void showTaskMarkedComplete();

        void showTaskMarkedActive();

        void showCompletedTasksCleared();

        void showLoadingTasksError();

        void showNoTasks();

        void showActiveFilterLabel();

        void showCompletedFilterLabel();

        void showAllFilterLabel();

        void showNoActiveTasks();

        void showNoCompletedTasks();

        void showSuccessfullySavedMessage();

        boolean isActive();

        void showFilteringPopUpMenu();
    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadTasks(boolean forceUpdate);

        void addNewTask();
    }
}
