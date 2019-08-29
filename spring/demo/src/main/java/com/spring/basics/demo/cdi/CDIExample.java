package com.spring.basics.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIExample {
    @Inject
    private CDIExampleDAO cdiExampleDAO;

    public CDIExampleDAO getCdiExampleDAO() {
        return cdiExampleDAO;
    }

    public void setCdiExampleDAO(CDIExampleDAO cdiExampleDAO) {
        this.cdiExampleDAO = cdiExampleDAO;
    }
}
