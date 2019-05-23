/*
 * Copyright 2019 Orient Securities Co., Ltd.
 * Copyright 2019 BoCloud Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orientsec.grpc.server;

import com.orientsec.grpc.common.Constants;
import com.orientsec.grpc.service.GreeterGrpc;
import com.orientsec.grpc.service.impl.GreeterImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * 通用的服务器
 *
 * @author huyn
 * @since 2018/7/25
 */
public class CommonServiceSecondServer extends GreeterServer{
  private static Logger logger = Logger.getLogger(CommonServiceSecondServer.class.getName());

  private Server server;
  private int port = Constants.Port.COMMON_SERVICE_SECOND_SERVER;
  private String serviceName = GreeterGrpc.SERVICE_NAME;
  private GreeterImpl serviceImpl;

  public void start() throws IOException {
    serviceImpl = new GreeterImpl();

    server = ServerBuilder.forPort(port)
            .addService(serviceImpl)
            .build()
            .start();

    logger.info("CommonServiceSecondServer start...");

    Runtime.getRuntime().addShutdownHook(new Thread() {

      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        CommonServiceSecondServer.this.stop();
        System.err.println("*** CommonServiceFirstServer shut down");
      }
    });
  }

  @Override
  public void stop() {
    if (server != null) {
      logger.info("stop CommonServiceFirstServer...");
      server.shutdown();
    }
  }

  // block 一直到退出程序
  public void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  public int getPort() {
    return port;
  }

  public String getServiceName() {
    return serviceName;
  }

  @Override
  public GreeterImpl getServiceImpl() {
    return serviceImpl;
  }

  public static void main(String[] args) {
    CommonServiceSecondServer server = new CommonServiceSecondServer();

    //System.out.println("pid=" + ProcessUtils.getProcessId());

    try {
      server.start();
      server.blockUntilShutdown();
    } catch (Exception ex) {
    }
  }

}
