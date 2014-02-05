package com.vogella.vde.mouseless;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;

import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.UIEvents.PartDescriptor;

import org.osgi.service.event.Event;

public class MouseLessProcessor {

  @Execute
  public void execute() {
	  System.out.println("MouseLessProcessor executed!");
  }
  
  @Inject
  //@Optional
  public void applicationStartup(@UIEventTopic(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE) Event event) {
	  System.out.println("Application startup complete!");
  }

} 