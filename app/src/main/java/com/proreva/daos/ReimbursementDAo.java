package com.proreva.daos;

import com.proreva.reimbursement.models.User;

public interface ReimbursementDAo {

    public boolean createRequest(ReimbursementDAo r, User u);
    public ReimbursementDAo viewRequest(int id);
    public boolean updateRequest(ReimbursementDAo r, User u);
    public boolean deleteRequest(int id);
    //might need this later
    //public void filterRequest();
}

