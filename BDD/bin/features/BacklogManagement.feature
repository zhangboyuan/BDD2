Feature: 通知未完成任务

描述

In order to 保证项目的进度

As a Scrum Master

I want to 查询未完成任务

Scenario: 未完成任务的查询
Give Sprint 开始日期是 2014-05-23

Given 团队有任务"TaskABC"
	| name | status |
	| Task123 | TODO |
	| TaskAB | TODO |
Given 团队有任务"TaskDEF"
	| name | call |
	| Task123 | TODO |
	| TaskAB | TODO |
When 团队完成"TaskABC"
	| name | status | date |
	| Task123 | DONE | 2014-05-26 |

Then 团队未完成的任务是"TaskDEF"
	| name |
	| TaskAB |
