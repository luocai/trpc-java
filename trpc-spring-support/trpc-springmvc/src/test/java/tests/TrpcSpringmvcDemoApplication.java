/*
 * Tencent is pleased to support the open source community by making tRPC available.
 *
 * Copyright (C) 2023 THL A29 Limited, a Tencent company. 
 * All rights reserved.
 *
 * If you have downloaded a copy of the tRPC source code from Tencent,
 * please note that tRPC source code is licensed under the Apache 2.0 License,
 * A copy of the Apache 2.0 License can be found in the LICENSE file.
 */

package tests;

import com.tencent.trpc.spring.boot.starters.annotation.EnableTRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTRpc
public class TrpcSpringmvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrpcSpringmvcDemoApplication.class, args);
    }

}
