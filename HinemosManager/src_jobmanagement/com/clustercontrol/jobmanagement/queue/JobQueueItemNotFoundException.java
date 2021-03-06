/*
 * Copyright (c) 2019 NTT DATA INTELLILINK Corporation. All rights reserved.
 *
 * Hinemos (http://www.hinemos.info/)
 *
 * See the LICENSE file for licensing information.
 */

package com.clustercontrol.jobmanagement.queue;

public class JobQueueItemNotFoundException extends JobQueueException {

	// 実装を変更したときのバージョン番号に合わせる。
	// {major(high)}_{major(low)}_{minor}_{patch}
	private static final long serialVersionUID = 6_02_00_00000000L;

	public JobQueueItemNotFoundException() {
		super();
	}

	public JobQueueItemNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JobQueueItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public JobQueueItemNotFoundException(String message) {
		super(message);
	}

	public JobQueueItemNotFoundException(Throwable cause) {
		super(cause);
	}
}
