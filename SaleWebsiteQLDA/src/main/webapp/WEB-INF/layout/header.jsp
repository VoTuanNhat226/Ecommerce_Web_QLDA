<%-- 
    Document   : header
    Created on : Apr 25, 2024, 7:38:26 PM
    Author     : tongh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand " href="#">BoardingHouse</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
            <ul class="navbar-nav">
                <li>
                    <a class="nav-link" href="<c:url value="/"/>">Trang chủ</a>
                </li>
                <li>
                    <a class="nav-link" href="<c:url value="/stats"/>">Thống kê</a>
                </li>
                <li>
                    <a class="btn btn-success" href="<c:url value="/products" />">Thêm sản phẩm</a>

                </li>

                <c:choose>
                    <c:when test="${pageContext.request.userPrincipal.name != null}">
                        <li>
                            <a class="nav-link" href="<c:url value="/"/>">
                                Chào ${pageContext.request.userPrincipal.name}!</a>

                        </li>
                        <li><a class="nav-link" href="<c:url value="/logout"/>">Đăng xuất</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Quản lý tài khoản
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                                <li>
                                    <a class="dropdown-item" href="<c:url value="/approve-user"/>">Duyệt tài khoản </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="<c:url value="/users"/>">Sửa role/Xóa tài khoản</a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Quản lý bài đăng
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                                <li>
                                    <a class="dropdown-item" href="<c:url value="/post"/>">Tất cả bài đăng</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="<c:url value="/lessor-post"/>">Bài đăng của chủ trọ</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="<c:url value="/customer-post"/>">Bài đăng của khách hàng</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a class="nav-link" href="<c:url value="/stats"/>">Thống kê</a>
                        </li>
                        <li>
                            <a class="nav-link" href="<c:url value="/"/>">Quản lý bình luận</a>
                        </li> 
                    </c:when>
                    <c:when test="${pageContext.request.userPrincipal.name == null}">
                        <li>
                            <a class="nav-link" href="<c:url value="/login"/>">Đăng nhập</a>
                        </li>
                    </c:when>
                </c:choose>


            </ul>
        </div>
    </div>
</nav>