/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.query.JRJpaQueryExecuterFactory;

/**
 *
 * @author zscrollock
 */
public class GerarRelatorio {
    
    public JasperPrint gerarFromList(String relatorio, List lista) throws JRException {
        InputStream relatorioJasper = getClass().getResourceAsStream(relatorio);
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(lista);
        return JasperFillManager.fillReport(relatorioJasper, null, dataSource);
    }
    
    public JasperPrint gerarFromJasper(String relatorio, EntityManager em) throws JRException {
        InputStream relatorioJasper = getClass().getResourceAsStream(relatorio);

        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put(JRJpaQueryExecuterFactory.PARAMETER_JPA_ENTITY_MANAGER, em);

        return JasperFillManager.fillReport(relatorioJasper, parametros);
    }
}
