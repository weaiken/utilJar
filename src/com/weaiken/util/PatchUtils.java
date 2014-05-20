package com.weaiken.util;

import com.weaiken.entity.PatchResult;


/**
 * PatchUtils
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2013-12-10
 */
public class PatchUtils {

    /**
     * patch old apk and patch file to new apk
     * s
     * @param oldApkPath
     * @param patchPath
     * @param newApkPath
     * @return
     */
    public static native PatchResult patch(String oldApkPath, String patchPath, String newApkPath);
}
