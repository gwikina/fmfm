# Feed me, Feed me (FmFm) - User Tracking and Health Monitoring

## Overview

Feed me, Feed me (FmFm) is an IoT-based ecosystem designed to ensure food security at different levels of granularity - personal, family, community, and nation. This repository specifically focuses on the User Tracking and Health Monitoring modules, addressing the first two levels of granularity.

## Table of Contents

- [Features](#features)
- - [Key Aspects of FmFm](#key-aspects-of-fmfm)
  - [Multiple Stakeholders with Diverse Goals](#1-multiple-stakeholders-with-diverse-goals)
  - [Blurred Line Between Digital, Physical, and Social Dimensions](#2-blurred-line-between-digital-physical-and-social-dimensions)
  - [Collection of Sensitive Data](#3-collection-of-sensitive-data)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)

## Features

### User Tracking Module

- User registration and profile management
- Tracking and analysis of health metrics (e.g., heart rate, blood pressure, sleep)
- CRUD operations for user data
- Integration with a database for persistent storage

### Health Monitoring Module

- Personalized notifications based on health and activity changes
- Integration with wearable devices for real-time health data
- Dynamic adaptation to changes in user behavior

## Key Aspects of FmFm

Feed me, Feed me (FmFm) is a unique IoT-based ecosystem designed to experiment and evaluate self-adaptation techniques for the Internet of Things (IoT). It illustrates several crucial aspects that make it well-suited for exploring adaptive software engineering. Understanding these key aspects is fundamental to the successful implementation of the FmFm system.

### 1. Multiple Stakeholders with Diverse Goals

FmFm involves various stakeholders, each with distinct and sometimes conflicting goals. Stakeholders include individuals, families, supermarkets, cities, and nations. For instance, individuals aim to adjust their food consumption for health benefits, while supermarkets aim to efficiently manage their stocks. Some goals are shared, such as minimizing food wastage, while others can be conflicting, such as minimizing costs for individuals and maximizing profits for supermarkets. In the context of IoT systems, software engineers often face challenges due to distributed control between service providers and consumers.

### 2. Blurred Line Between Digital, Physical, and Social Dimensions

FmFm highlights the intricate interplay between digital, physical, and social dimensions. Wearable devices monitor individual food consumption, IoT devices facilitate communication among smart appliances for meal preparation, and O2O (Online to Offline) services enable food ordering and delivery. Software systems must seamlessly communicate with these devices and services, often requiring interaction with human actors. FmFm emphasizes shared control and partial automation between humans and the software system. For example, users can make ad hoc decisions about meals and activities, and the system must adapt to accommodate these changes effectively.

### 3. Collection of Sensitive Data

FmFm underscores the sensing capabilities of IoT devices, allowing the collection of diverse data about users and their environment. However, interpreting this data and making it accessible to users for informed decision-making requires a deeper understanding. For instance, supermarkets collect data about consumers to enhance supply chain efficiency. Transparency in this process is essential, enabling users to understand what the system is doing and why. Explicit mechanisms, such as sharing data with other retailers, should be well-defined.

These key aspects provide a rich context for experimenting with and evaluating self-adaptation techniques in the FmFm system. Software engineers working on this project must consider the intricate dynamics between stakeholders, the fusion of digital and physical dimensions, and the responsible handling of sensitive data.


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Maven
- [Spring Boot](https://spring.io/projects/spring-boot)
