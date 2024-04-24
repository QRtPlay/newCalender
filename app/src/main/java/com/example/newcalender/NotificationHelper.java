package com.example.newcalender;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

public class NotificationHelper {
    public static void showNotification(Context context, String title, String message) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(context)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(android.R.drawable.ic_dialog_info);
        notificationManager.notify(0, builder.build());
    }
}
