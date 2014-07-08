Launcher3
=========

A version of [Launcher3](https://android.googlesource.com/platform/packages/apps/Launcher3/) that is buildable via Gradle. Nothing has been altered other than the Gradle files and what is mentionned below.

Included in this repository are the Google Protobuf-java library and the backup/BackupProtos.java file, so that the Google Backup Helper can function. Those were not present on the GoogleSource repository.

The WallpaperPicker, also included in this repository, is built separately and then used as a library by the main app. Another way to do it is to merge both folders into one. Both modules (:app & :WallpaperPicker) share the same package name (*com.android.launcher3*), therefore a line has been added to the [app/build.gradle](https://github.com/geecko86/Launcher3/app/build.gradle#L13) file. This will not function in the future and is scheduled to be forbidden. In the event that you cannot force the use of one single package name and that this repo has not been updated, consider simply merging both folders. This was done because I did not want to alter the file structure of the original repository.

#Finally and most importantly, you need to install this as a system app in order to use all features.

*Merged from [AOSP 4.4.4_r1](https://android.googlesource.com/platform/packages/apps/Launcher3/+/android-4.4.4_r1) on June 30th.
