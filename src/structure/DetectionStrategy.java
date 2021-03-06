/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

import metrics.Granulatiry;

/**
 *
 * @author bruno
 */
public class DetectionStrategy {
    
    private Integer id;
    private String name;
    private Granulatiry granularity;
    private String expression;

    public DetectionStrategy(String name, Granulatiry granularity, String expression) {
        this.name = name;
        this.granularity = granularity;
        this.expression = expression;
    }

    public DetectionStrategy(Integer id, String name, Granulatiry granularity, String expression) {
        this.id = id;
        this.name = name;
        this.granularity = granularity;
        this.expression = expression;
    }
    
    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getExpression() {
        return this.expression;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    public Granulatiry getGranularity(){
        return this.granularity;
    }
    
}
