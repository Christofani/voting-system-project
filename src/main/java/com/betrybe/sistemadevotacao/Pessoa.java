package com.betrybe.sistemadevotacao;

/**
 * The type Pessoa.
 */
public abstract class Pessoa {

  /**
   * The Nome.
   */
  protected String nome;

  /**
   * Instantiates a new Pessoa.
   */
  public Pessoa() {
  }

  /**
   * Gets nome.
   *
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * Sets nome.
   *
   * @param nome the nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
