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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
public class CommandReport {
  @XmlElement
  String actionId;
  @XmlElement
  String stdout;
  @XmlElement
  String stderr;
  @XmlElement
  String status;
  @XmlElement
  int exitCode;
 
  public String getActionId() {
    return this.actionId;
  }
 
  public void setActionId(String actionId) {
    this.actionId = actionId;
  }
  
  public String getStdErr() {
    return this.stderr;
  }
  
  public void setStdErr(String stderr) {
    this.stderr = stderr;
  }
  
  public int getExitCode() {
    return this.exitCode;
  }
  
  public void setExitCode(int exitCode) {
    this.exitCode = exitCode;
  }
  
  public String getStdOut() {
    return this.stdout;
  }
  
  public void setStdOut(String stdout) {
    this.stdout = stdout;
  }
}
