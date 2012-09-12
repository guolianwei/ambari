/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.agent;

import java.util.ArrayList;

import com.google.inject.Singleton;


/**
 * This class handles the heartbeats coming from the agent, passes on the information
 * to other modules and processes the queue to send heartbeat response.
 */
@Singleton
public class HeartBeatHandler {
  public HeartBeatResponse handleHeartBeat(HeartBeat heartbeat) {
    HeartBeatResponse response = new HeartBeatResponse();
    response.setAgentCommands(new ArrayList<AgentCommand>());
    response.setClusterId("test");
    response.setResponseId(999L);
    return response;    
  }
  
  public RegistrationResponse handleRegistration(Register register) {
    RegistrationResponse registrationResponse = new RegistrationResponse();
    registrationResponse.setResponseStatus(RegistrationStatus.OK);
    return registrationResponse;
  }
}
