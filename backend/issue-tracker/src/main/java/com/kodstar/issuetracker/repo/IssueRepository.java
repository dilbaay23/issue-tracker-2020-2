package com.kodstar.issuetracker.repo;

import com.kodstar.issuetracker.entity.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends CrudRepository<Issue,Long> {

    Issue findByTitle(String title);


}
