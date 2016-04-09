/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.incubator.net.faultmanagement.alarm;


import com.google.common.annotations.Beta;
import org.onosproject.net.DeviceId;
import org.onosproject.net.provider.ProviderService;

import java.util.Collection;

/**
 * The interface Alarm provider service.
 */
@Beta
public interface AlarmProviderService extends ProviderService<AlarmProvider> {

    /**
     * Sends active alarm list for a device.
     *
     * @param deviceId identity of the device
     * @param alarms   list of device alarms
     */
    void updateAlarmList(DeviceId deviceId, Collection<Alarm> alarms);

}
