package tuantienti.service.impl;

import tuantienti.model.Blog;
import tuantienti.repository.BlogRepository;
import tuantienti.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository customerRepository;

    @Override
    public List<Blog> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        customerRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}