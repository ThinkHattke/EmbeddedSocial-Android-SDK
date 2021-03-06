/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 */

package com.microsoft.embeddedsocial.event.relationship;

import com.microsoft.embeddedsocial.base.event.HandlingThread;
import com.microsoft.embeddedsocial.base.event.ThreadType;
import com.microsoft.embeddedsocial.event.BaseUserEvent;

/**
 * User has been blocked event.
 */
@HandlingThread(ThreadType.CALLING_MAIN)
public class UserBlockedEvent extends BaseUserEvent {
    public UserBlockedEvent(String userHandle) {
        super(userHandle);
    }
}
