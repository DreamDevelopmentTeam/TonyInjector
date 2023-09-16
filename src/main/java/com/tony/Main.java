package com.tony;

import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void premain(String args, Instrumentation inst) throws Exception
    {
        System.out.println("Premain> Start...");
    }

    public static void agentmain(String args, Instrumentation inst) throws Exception {
        System.out.println("AgentMain> Start...");

    }


}