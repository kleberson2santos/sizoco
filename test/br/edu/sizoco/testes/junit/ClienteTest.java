package br.edu.sizoco.testes.junit;

import javax.persistence.EntityManager;
import br.edu.sizoco.model.Cliente;
import br.edu.sizoco.jpa.EntityManagerUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert; 

public class ClienteTest {
    
    EntityManager em;
    
    public ClienteTest() {
    }
    
    @Before
    public void setUp() {
        em = EntityManagerUtil.getEntityManager();
    }
    
    @After
    public void tearDown() {
        em.close();
    }

    @Test
    @SuppressWarnings("CallToPrintStackTrace")
    public void teste() {
    boolean exception = false;
        try {
            Cliente pf = new Cliente();
            pf.setCpf("459.933.470-74"); 
            pf.setNome("Kleber");
            pf.setTelefone("(54)7896-0956");
            pf.setEmail("kleber@kleber");
            pf.setUsuarioLogin("kleber");
            pf.setUsuarioPassword("1234");
            
            em.getTransaction().begin();
            em.persist(pf);
            em.getTransaction().commit();
        } catch (Exception e){
            exception = true;
            e.printStackTrace();
        }
        Assert.assertEquals(false, exception);
        
    }     
}
