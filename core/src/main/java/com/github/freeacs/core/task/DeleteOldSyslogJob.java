package com.github.freeacs.core.task;

import com.github.freeacs.common.quartz.QuartzJob;
import org.quartz.DisallowConcurrentExecution;

@DisallowConcurrentExecution
public class DeleteOldSyslogJob extends QuartzJob {}
