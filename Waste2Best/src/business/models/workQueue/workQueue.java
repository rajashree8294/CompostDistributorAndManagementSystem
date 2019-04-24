/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.models.workQueue;

import business.models.workRequest.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Rajashree
 */
public class workQueue {
private ArrayList<WorkRequest> workRequestList;

   public workQueue(){
       workRequestList = new ArrayList<>();
   }

   public ArrayList<WorkRequest> getWorkRequestList() {
       return workRequestList;
   }

   public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
       this.workRequestList = workRequestList;
   }
}
