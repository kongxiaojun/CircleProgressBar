# CircleProgressBar
Android Circle ProgressBar like IOS download app progressbar
圆形进度条，类似IOS安装应用时的进度条

#Usage

    <com.kxj.circleprogressbar.CircleProgressBar
        android:id="@+id/circleProgressBar"
        android:layout_width="100dp"
        android:layout_height="100dp"
        cpb:progress_background="@android:color/darker_gray"
        cpb:progress_color="@android:color/white"
        cpb:radius="30dp"/>
        
        
    circleProgressBar = (CircleProgressBar) findViewById(R.id.circleProgressBar);
    circleProgressBar.setMax(max);
    circleProgressBar.setProgress(progress);
    
#Screenshot
![Alt text](screenshot/screenshot6653604926072272711.png)
