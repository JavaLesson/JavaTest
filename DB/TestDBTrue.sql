-- MySQL Workbench Synchronization
-- Generated: 2017-06-14 15:20
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: User

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `userId` INT auto_increment,
  `mail` VARCHAR(45) NOT NULL,
  `password` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `userId_UNIQUE` (`userId` ASC),
  UNIQUE INDEX `password_UNIQUE` (`password` ASC),
  UNIQUE INDEX `mail_UNIQUE` (`mail` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`topic` (
  `topicId` INT auto_increment,
  `topic` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`topicId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`literature` (
  `literatureId` INT auto_increment,
  `description` VARCHAR(45) NOT NULL,
  `questionId` INT NOT NULL,
  `linkId` INT NOT NULL,
  PRIMARY KEY (`literatureId`, `questionId`, `linkId`),
  INDEX `fk_Literature_Link_idx` (`linkId` ASC),
  INDEX `fk_Literature_Question_idx` (`questionId` ASC),
  CONSTRAINT `fk_Literature_Link`
    FOREIGN KEY (`linkId`)
    REFERENCES `mydb`.`link` (`linkId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Literature_Question`
    FOREIGN KEY (`questionId`)
    REFERENCES `mydb`.`question` (`questionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`question` (
  `questionId` INT auto_increment,
  `question` VARCHAR(45) NOT NULL,
  `topickId` INT NOT NULL,
  PRIMARY KEY (`questionId`, `topickId`),
  INDEX `fk_Question_Topick_idx` (`topickId` ASC),
  CONSTRAINT `fk_Question_Topick`
    FOREIGN KEY (`topickId`)
    REFERENCES `mydb`.`topic` (`topicId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`answer` (
  `answerId` INT auto_increment,
  `answer` VARCHAR(45) NOT NULL,
  `correct` boolean NOT NULL,
  `questionId` INT(11) NOT NULL,
  PRIMARY KEY (`answerId`, `questionId`),
  INDEX `fk_Answer_Question_idx` (`questionId` ASC),
  CONSTRAINT `fk_Answer_Question`
    FOREIGN KEY (`questionId`)
    REFERENCES `mydb`.`Question` (`questionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`userQustion` (
  `userQuestionId` INT auto_increment,
  `statistics` INT NULL DEFAULT NULL,
  `questioId` INT NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`userQuestionId`, `questioId`, `userId`),
  INDEX `fk_UserQustions_Question_idx` (`questioId` ASC),
  INDEX `fk_UserQustions_User_idx` (`userId` ASC),
  CONSTRAINT `fk_UserQustions_Question`
    FOREIGN KEY (`questioId`)
    REFERENCES `mydb`.`question` (`questionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserQustions_User`
    FOREIGN KEY (`userId`)
    REFERENCES `mydb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`link` (
  `linkId` INT auto_increment,
  `link` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`linkId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
