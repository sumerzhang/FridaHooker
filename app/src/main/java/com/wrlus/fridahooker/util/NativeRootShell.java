package com.wrlus.fridahooker.util;

public class NativeRootShell {

    static {
        System.loadLibrary("seciot");
    }

    public static native int execute(String cmd);
//    public static native int execute(char cmds[][]);
    public static native int executeRoot(String cmd);
//    public static native int executeRoot(char[] cmds);
}
