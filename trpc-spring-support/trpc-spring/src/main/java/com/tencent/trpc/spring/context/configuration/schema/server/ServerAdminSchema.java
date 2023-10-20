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

package com.tencent.trpc.spring.context.configuration.schema.server;

/**
 * Configurations for admin server
 *
 * @see com.tencent.trpc.core.common.config.AdminConfig
 */
public class ServerAdminSchema {

    /**
     * Admin server binding ip
     */
    private String adminIp;
    /**
     * Admin server binding port
     */
    private Integer adminPort;

    public String getAdminIp() {
        return adminIp;
    }

    public void setAdminIp(String adminIp) {
        this.adminIp = adminIp;
    }

    public Integer getAdminPort() {
        return adminPort;
    }

    public void setAdminPort(Integer adminPort) {
        this.adminPort = adminPort;
    }

    @Override
    public String toString() {
        return "ServerAdminSchema{" +
                "adminIp='" + adminIp + '\'' +
                ", adminPort=" + adminPort +
                '}';
    }
}
