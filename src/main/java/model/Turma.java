/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author lpw
 */
public class Turma {
    
    private String cod;
    private ArrayList<Aluno> alunos;
    private Materia materia;
    private Professor professor;
    private String horario;
    private int[][] faltas;
    private double[][] notas;

    public Turma(String cod, ArrayList<Aluno> alunos, Materia materia, Professor professor, String horario, int[][] faltas, double[][] notas) {
        this.cod = cod;
        this.alunos = alunos;
        this.materia = materia;
        this.professor = professor;
        this.horario = horario;
        this.faltas = faltas;
        this.notas = notas;
    }

    public Turma() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int[][] getFaltas() {
        return faltas;
    }

    public void setFaltas(int[][] faltas) {
        this.faltas = faltas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    
    
    
}
