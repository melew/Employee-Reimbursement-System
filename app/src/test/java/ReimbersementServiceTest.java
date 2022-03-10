

import com.proreva.daos.ReimbursementDAo;
import com.proreva.models.Reimbursement;
import com.proreva.models.User;
import com.proreva.service.ReimbursementService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


public class ReimbersementTest {


    @Mock
    ReimbursementDAo rd;


    @InjectMocks
    ReimbursementService rs;
    User u;
    Reimbursement r;

    @Before
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testCreateRequest(){

        u = new User();
        r = new Reimbursement();

        when(rd.createRequest(r,u)).thenReturn(true);
        assertTrue(rs.createRequest(r,u));
    }
    @Test
    public void testGetRequest(){
        r = new Reimbursement();
        List<Reimbursement> list = new ArrayList<>();
        when(rd.getAllPendingRequestsById(2)).thenReturn(list);

        assertNotNull(rs.getAllPendingRequestsById(2));
    }
    @Test
    public void testUpdateRequest(){
        r = new Reimbursement();
        u = new User();

        when(rd.updateReimbursementRequest(r, u)).thenReturn(true);

        assertTrue(rs.updateRequest(r,u));
    }
//    @Test
//    public void testDeleteRequest(){
//        r = new Reimbursement();
//        u = new User();
//
//       when(rd.deleteRequest(2)).then return(true);
//
//        assertTrue(rs.deleteRequest(2));
//    }
    @Test
    public void testGetAllRequests(){
        r = new Reimbursement();
        List<Reimbursement> listR = new ArrayList<>();
        listR.add(r);
        when(rd.getAllRequests()).thenReturn(listR);

        assertNotNull(rd.getAllRequests());
    }
}


