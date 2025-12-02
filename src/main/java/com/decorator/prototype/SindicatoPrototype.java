package com.decorator.prototype;

public class SindicatoPrototype implements Cloneable {

    private String nome;
    private String categoria;
    private double mensalidade;

    public SindicatoPrototype(String nome, String categoria, double mensalidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public SindicatoPrototype clone() {
        try {
            return (SindicatoPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonagem n2o suportada", e);
        }
    }

    @Override
    public String toString() {
        return "SindicatoPrototype{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", mensalidade=" + mensalidade +
                '}';
    }
}

