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

package com.tencent.trpc.core.rpc;

import com.tencent.trpc.core.common.config.ConsumerConfig;
import com.tencent.trpc.core.common.config.ProtocolConfig;

/**
 * Provides an encapsulation for the interface invocation class.
 */
public interface ConsumerInvoker<T> extends Invoker<T> {

    /**
     * Get the client call service-related configuration.
     */
    ConsumerConfig<T> getConfig();

    /**
     * Get the protocol configuration information.
     */
    ProtocolConfig getProtocolConfig();

}
