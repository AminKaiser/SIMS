-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2016 at 07:00 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sims_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `document_info`
--

CREATE TABLE `document_info` (
  `Name` varchar(200) NOT NULL,
  `Roll` varchar(100) NOT NULL,
  `Reg` varchar(200) NOT NULL,
  `Session` varchar(200) NOT NULL,
  `Semester` varchar(200) NOT NULL,
  `DateOfIssue` date NOT NULL,
  `DateOWithDraw` date NOT NULL,
  `criteria` varchar(200) NOT NULL,
  `written_by` varchar(200) NOT NULL,
  `Checked_By` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `document_info`
--

INSERT INTO `document_info` (`Name`, `Roll`, `Reg`, `Session`, `Semester`, `DateOfIssue`, `DateOWithDraw`, `criteria`, `written_by`, `Checked_By`) VALUES
('Md. Amin Kaiser', '633511', '523410', '2012-2013', '2nd Semester', '2016-06-05', '2016-06-05', 'Testimonial', 'Abdus Salam', 'Abdus Salam');

-- --------------------------------------------------------

--
-- Table structure for table `eighth_semester_drop`
--

CREATE TABLE `eighth_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `eighth_semester_result`
--

CREATE TABLE `eighth_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fifth_semester_drop`
--

CREATE TABLE `fifth_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fifth_semester_drop`
--

INSERT INTO `fifth_semester_drop` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '5th Semester', '0.00');

-- --------------------------------------------------------

--
-- Table structure for table `fifth_semester_result`
--

CREATE TABLE `fifth_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fifth_semester_result`
--

INSERT INTO `fifth_semester_result` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Naziur Rahman', '533515', '523422', '2012-2013', '5th Semester', '3.5'),
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '5th Semester', '3.6'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '5th Semester', '0.00');

-- --------------------------------------------------------

--
-- Table structure for table `first_semester_drop`
--

CREATE TABLE `first_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `first_semester_result`
--

CREATE TABLE `first_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(50) NOT NULL,
  `reg` varchar(50) NOT NULL,
  `session` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `cgpa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `first_semester_result`
--

INSERT INTO `first_semester_result` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Naziur Rahman', '533515', '523422', '2012-2013', '1st Semester', '3.4'),
('true', 'Maruf', '632617', '527664', '2012-2013', '1st Semester', '3.00'),
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '1st Semester', '3.53'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '1st Semester', '3.86'),
('true', 'Vocti Chakma', '633518', '523398', '2012-2013', '1st Semester', '3.80');

-- --------------------------------------------------------

--
-- Table structure for table `fourth_semester_drop`
--

CREATE TABLE `fourth_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fourth_semester_drop`
--

INSERT INTO `fourth_semester_drop` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '4th Semester', '0.00'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '4th Semester', '0.00'),
('true', 'Vocti Chakma', '633518', '523398', '2012-2013', '4th Semester', '0.00');

-- --------------------------------------------------------

--
-- Table structure for table `fourth_semester_result`
--

CREATE TABLE `fourth_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fourth_semester_result`
--

INSERT INTO `fourth_semester_result` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Naziur Rahman', '533515', '523422', '2012-2013', '4th Semester', '4.5'),
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '4th Semester', '3.50'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '4th Semester', '3.40'),
('true', 'Vocti Chakma', '633518', '523398', '2012-2013', '4th Semester', '0.00');

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `usertype` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`usertype`, `username`, `password`) VALUES
('Admin', 'Amin Kaiser', '12345'),
('Admin', 'Swarup', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `second_semester_drop`
--

CREATE TABLE `second_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `second_semester_result`
--

CREATE TABLE `second_semester_result` (
  `promotestatus` varchar(6) DEFAULT NULL,
  `name` varchar(300) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(50) NOT NULL,
  `session` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `cgpa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `second_semester_result`
--

INSERT INTO `second_semester_result` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Naziur Rahman', '533515', '523422', '2012-2013', '2nd Semester', '3.35'),
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '2nd Semester', '7'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '2nd Semester', '9'),
('true', 'Vocti Chakma', '633518', '523398', '2012-2013', '2nd Semester', '3.00');

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE `session` (
  `session` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`session`) VALUES
('2012-2013'),
('2013-2014');

-- --------------------------------------------------------

--
-- Table structure for table `seventh_semster_drop`
--

CREATE TABLE `seventh_semster_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `seventh_semster_result`
--

CREATE TABLE `seventh_semster_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sixth_semester_drop`
--

CREATE TABLE `sixth_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sixth_semester_result`
--

CREATE TABLE `sixth_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_information`
--

CREATE TABLE `student_information` (
  `Stu_Name` varchar(200) NOT NULL,
  `Stu_Roll` varchar(200) NOT NULL,
  `Stu_RegNo` varchar(200) NOT NULL,
  `Stu_Session` varchar(200) NOT NULL,
  `Stu_semester` varchar(200) NOT NULL,
  `Gender` varchar(100) DEFAULT NULL,
  `Blood_Grp` varchar(200) DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `Religion` varchar(200) DEFAULT NULL,
  `Mobile` varchar(200) DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `Providhan` varchar(200) DEFAULT NULL,
  `Fathers_Name` varchar(200) DEFAULT NULL,
  `FatherNID` varchar(200) DEFAULT NULL,
  `Father_Occupaion` varchar(200) DEFAULT NULL,
  `Father_mobile` varchar(200) DEFAULT NULL,
  `Mothers_Name` varchar(200) DEFAULT NULL,
  `MotherNID` varchar(200) DEFAULT NULL,
  `Mother_Occupation` varchar(200) DEFAULT NULL,
  `Mother_mobile` varchar(200) DEFAULT NULL,
  `parmanent_Addr` varchar(200) DEFAULT NULL,
  `present_Addr` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_information`
--

INSERT INTO `student_information` (`Stu_Name`, `Stu_Roll`, `Stu_RegNo`, `Stu_Session`, `Stu_semester`, `Gender`, `Blood_Grp`, `BirthDate`, `Religion`, `Mobile`, `Email`, `Providhan`, `Fathers_Name`, `FatherNID`, `Father_Occupaion`, `Father_mobile`, `Mothers_Name`, `MotherNID`, `Mother_Occupation`, `Mother_mobile`, `parmanent_Addr`, `present_Addr`) VALUES
('Naziur Rahman', '533515', '523422', '2012-2013', '6th Semester', 'Male', 'A Negative(A-)', '1996-06-06', 'Islam', '07716636773', 'riaz@hotmail.com', '2010', 'Bokteyar Rahman', '12322111222', 'Teacher', '1283883455', 'Nazma Rahman', '322443333222', 'Teacher', '882388866', 'Hathazari', 'Hathazari'),
('Maruf', '632617', '527664', '2012-2013', '1st Semester', 'Male', 'Select', '2016-06-05', 'Select', '', '', '', 'Musa Ahamed', '3333333222', 'Provashi', '', 'Nayma Begum', '333333333', 'Housewife', '', 'Kumira, Chittagong', 'Kumira, Chittagong'),
('Sukriti Chakraborty', '632629', '523368', '2012-2013', '6th Semester', 'Male', 'B Positive(B+)', '1996-01-10', 'Hinduism', '01851915713', 'sukriti@gmail.com', '2010', 'Suresh Chakraborty', '01234466666655555', 'Employeer', '021448877747', 'Konika Chakraborty', '342515773333333333', 'Housewife', '012333444555', 'Boalkhali, Chittagong', 'Boalkhali, Chittagong'),
('Md. Amin Kaiser', '633511', '523410', '2012-2013', '5th Semester', 'Male', 'B Positive(B+)', '1996-10-14', 'Islam', '01552722663', 'aminkaiser90@gmail.com', '2010', 'Md. Nurul Amin', '1234567890887', 'Employeer', '01815375410', 'Ferdous Begum', '6554123456677', 'Housewife', '01559285990', 'Baghaichari, Rangamati', 'Chittagong'),
('Vocti Chakma', '633518', '523398', '2012-2013', '4th Semester', 'Male', 'B Positive(B+)', '1997-01-01', 'Buddhism', '0155788532', 'vokti@gmail.com', '2010', 'Radision Chakma', '123457865543', 'Farmer', '01277565374', 'Rupali Chakma', '3455667788999', 'Housewife', '01928873778', 'Baghaichari, Rangamati', 'Chittagong');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_information`
--

CREATE TABLE `teacher_information` (
  `Teacher_Name` varchar(200) NOT NULL,
  `Teacher_Desig` varchar(50) NOT NULL,
  `Teacher_Mobile` varchar(50) DEFAULT NULL,
  `Teacher_Email` varchar(100) DEFAULT NULL,
  `Teacher_Address` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_information`
--

INSERT INTO `teacher_information` (`Teacher_Name`, `Teacher_Desig`, `Teacher_Mobile`, `Teacher_Email`, `Teacher_Address`) VALUES
('Abdus Salam', 'Cheif Instructor', '018234525643', 'abdussalam@gmail.com', 'Rangunia,Chittagong');

-- --------------------------------------------------------

--
-- Table structure for table `temp`
--

CREATE TABLE `temp` (
  `username` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temp`
--

INSERT INTO `temp` (`username`) VALUES
('Amin Kaiser');

-- --------------------------------------------------------

--
-- Table structure for table `third_semester_drop`
--

CREATE TABLE `third_semester_drop` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `roll` varchar(100) NOT NULL,
  `reg` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `cgpa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `third_semester_result`
--

CREATE TABLE `third_semester_result` (
  `promotestatus` varchar(100) DEFAULT NULL,
  `name` varchar(200) NOT NULL,
  `roll` varchar(200) NOT NULL,
  `reg` varchar(200) NOT NULL,
  `session` varchar(200) NOT NULL,
  `semester` varchar(200) NOT NULL,
  `cgpa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `third_semester_result`
--

INSERT INTO `third_semester_result` (`promotestatus`, `name`, `roll`, `reg`, `session`, `semester`, `cgpa`) VALUES
('true', 'Naziur Rahman', '533515', '523422', '2012-2013', '3rd Semester', '5'),
('true', 'Sukriti Chakraborty', '632629', '523368', '2012-2013', '3rd Semester', '5'),
('true', 'Md. Amin Kaiser', '633511', '523410', '2012-2013', '3rd Semester', '5'),
('true', 'Vocti Chakma', '633518', '523398', '2012-2013', '3rd Semester', '4.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eighth_semester_drop`
--
ALTER TABLE `eighth_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `eighth_semester_result`
--
ALTER TABLE `eighth_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `fifth_semester_drop`
--
ALTER TABLE `fifth_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `fifth_semester_result`
--
ALTER TABLE `fifth_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `first_semester_drop`
--
ALTER TABLE `first_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `first_semester_result`
--
ALTER TABLE `first_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `fourth_semester_drop`
--
ALTER TABLE `fourth_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `fourth_semester_result`
--
ALTER TABLE `fourth_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `second_semester_drop`
--
ALTER TABLE `second_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `second_semester_result`
--
ALTER TABLE `second_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`session`);

--
-- Indexes for table `seventh_semster_drop`
--
ALTER TABLE `seventh_semster_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `seventh_semster_result`
--
ALTER TABLE `seventh_semster_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `sixth_semester_drop`
--
ALTER TABLE `sixth_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `sixth_semester_result`
--
ALTER TABLE `sixth_semester_result`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `student_information`
--
ALTER TABLE `student_information`
  ADD PRIMARY KEY (`Stu_Roll`);

--
-- Indexes for table `third_semester_drop`
--
ALTER TABLE `third_semester_drop`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `third_semester_result`
--
ALTER TABLE `third_semester_result`
  ADD PRIMARY KEY (`roll`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
