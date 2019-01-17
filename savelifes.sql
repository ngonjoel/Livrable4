-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le :  jeu. 17 jan. 2019 à 09:24
-- Version du serveur :  5.7.22
-- Version de PHP :  7.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `savelifes`
--

-- --------------------------------------------------------

--
-- Structure de la table `donneurs`
--

CREATE TABLE `donneurs` (
  `idDonneur` int(10) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `sexe` varchar(3) NOT NULL,
  `age` varchar(3) NOT NULL,
  `groupSang` varchar(5) NOT NULL,
  `telephone` varchar(13) NOT NULL,
  `adresseMail` varchar(30) NOT NULL,
  `villeResidence` varchar(30) NOT NULL,
  `date` varchar(30) DEFAULT NULL,
  `login` varchar(100) NOT NULL,
  `motDePasse` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Cette table contient les données d''enregistrement du donneur';

--
-- Déchargement des données de la table `donneurs`
--

INSERT INTO `donneurs` (`idDonneur`, `nom`, `prenom`, `sexe`, `age`, `groupSang`, `telephone`, `adresseMail`, `villeResidence`, `date`, `login`, `motDePasse`) VALUES
(11, 'yrr', 'rrt', 'M', '18', 'A-', 'ryryry', 'rtrtet', 'ryryrty', '05-01-2019', 'don.yrr@save', 'rtrtr'),
(12, 'gfff', 'ffggg', 'M', '18', 'A-', 'ffghhh', 'fgghhhh', 'fghjj', '06-01-2019', 'don.gff@save', 'fff');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `donneurs`
--
ALTER TABLE `donneurs`
  ADD PRIMARY KEY (`idDonneur`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `donneurs`
--
ALTER TABLE `donneurs`
  MODIFY `idDonneur` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
