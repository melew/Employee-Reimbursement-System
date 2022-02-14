package com.proreva.controller;

import com.proreva.daos.ReimbursementDAo;
import com.proreva.daos.ReimbursementDAoImpl;
import com.proreva.reimbursement.models.Reimbursement;
import com.proreva.reimbursement.models.User;

public class RembersmentController {
    // @PostRequestMapping("/rembersmentRequest"
    public String createRequest(Reimbursement r, User user) {
        ReimbursementDAo reimbursementDAo = new ReimbursementDAoImpl();
        boolean request = reimbursementDAo.createRequest(r, user);

        if(Boolean.TRUE.equals(request)){
           return  "Request submitted successfully" + r.getId();
        } else {
            return  "Request submitted unsuccessful";
        }
    }

    public String getReimbursementStatus(int reembersmentConfirmationId) {
        ReimbursementDAo reimbursementDAo = new ReimbursementDAoImpl();
        return reimbursementDAo.viewRequest(reembersmentConfirmationId);

    }
}
