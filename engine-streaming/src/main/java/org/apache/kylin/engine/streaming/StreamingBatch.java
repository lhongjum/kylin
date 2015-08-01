/*
 *
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *
 *  contributor license agreements. See the NOTICE file distributed with
 *
 *  this work for additional information regarding copyright ownership.
 *
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *
 *  (the "License"); you may not use this file except in compliance with
 *
 *  the License. You may obtain a copy of the License at
 *
 *
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 *
 *  Unless required by applicable law or agreed to in writing, software
 *
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *
 *  limitations under the License.
 *
 * /
 */
package org.apache.kylin.engine.streaming;

import org.apache.kylin.common.util.Pair;

import java.util.List;

/**
 */
public final class StreamingBatch {
    
    private final List<StreamingMessage> messages;
    
    private final Pair<Long, Long> timeRange;

    public StreamingBatch(List<StreamingMessage> messages, Pair<Long, Long> timeRange) {
        this.messages = messages;
        this.timeRange = timeRange;
    }

    public List<StreamingMessage> getMessages() {
        return messages;
    }
    
    public Pair<Long, Long> getTimeRange() {
        return timeRange;
    }
    
}
