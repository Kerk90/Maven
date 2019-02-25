/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade1;

import Facade0.BugTracker;
import Facade0.Developer;
import Facade0.Job;

/**
 *
 * @author User
 */
public class WorkFlow {
   Developer developer = new Developer();
   Job job = new Job();
   BugTracker bugTracker = new BugTracker();
   public void solveProblem(){
       job.doJob();
       bugTracker.startSprint();
       developer.doJobBeforeDeadLine(bugTracker);
   }
}
