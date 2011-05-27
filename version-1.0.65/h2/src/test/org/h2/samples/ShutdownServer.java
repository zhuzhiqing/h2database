/*
 * Copyright 2004-2007 H2 Group. Licensed under the H2 License, Version 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.samples;

/**
 * This very simple sample application stops a H2 TCP server
 * if it is running.
 */
public class ShutdownServer {

    public static void main(String[] args) throws Exception {
        org.h2.tools.Server.shutdownTcpServer("tcp://localhost:9094", "", false);
     }
}
