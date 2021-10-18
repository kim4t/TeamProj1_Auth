package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.ApplicationWorkFlow;

import java.util.List;

public interface ApplicationWorkFlowDao {
    ApplicationWorkFlow getApplicationWorkFlowById(int id);

    List<ApplicationWorkFlow> getAllApplicationWorkFlow();

    ApplicationWorkFlow addApplicationWorkFlow(ApplicationWorkFlow applicationWorkFlow);

    ApplicationWorkFlow getApplicationWorkFlowByEmployeeId(int employeeId);

    ApplicationWorkFlow updateApplicationWorkFlow (ApplicationWorkFlow applicationWorkFlow);
}
