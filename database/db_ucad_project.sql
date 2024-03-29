-- MySQL Script generated by MySQL Workbench
-- Tue Jun 11 11:06:22 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema db_ucad_project
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_ucad_project` ;

-- -----------------------------------------------------
-- Schema db_ucad_project
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_ucad_project` DEFAULT CHARACTER SET utf8 ;
USE `db_ucad_project` ;

-- -----------------------------------------------------
-- Table `db_ucad_project`.`classe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ucad_project`.`classe` ;

CREATE TABLE IF NOT EXISTS `db_ucad_project`.`classe` (
  `idclasse` INT NOT NULL,
  `niveau` VARCHAR(45) NULL,
  `departement` VARCHAR(45) NULL,
  `faculte` VARCHAR(45) NULL,
  PRIMARY KEY (`idclasse`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ucad_project`.`etudiant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ucad_project`.`etudiant` ;

CREATE TABLE IF NOT EXISTS `db_ucad_project`.`etudiant` (
  `idetudiant` INT NOT NULL AUTO_INCREMENT,
  `nce` VARCHAR(45) NULL,
  `idclasse` INT NULL,
  `prenom` VARCHAR(45) NULL,
  `nom` VARCHAR(45) NULL,
  `date_naissance` DATE NULL,
  PRIMARY KEY (`idetudiant`),
  UNIQUE INDEX `nce_UNIQUE` (`nce` ASC),
  INDEX `fk_classe_idx` (`idclasse` ASC),
  CONSTRAINT `fk_classe`
    FOREIGN KEY (`idclasse`)
    REFERENCES `db_ucad_project`.`classe` (`idclasse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
