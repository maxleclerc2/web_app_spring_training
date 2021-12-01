package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApplicationIdentifierFilter implements Filter {
    private final String myUUID;

    public ApplicationIdentifierFilter() {
        myUUID = UUID.randomUUID().toString();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setHeader("Instance-Id", myUUID);

        filterChain.doFilter(servletRequest, response);
    }
}
