package com.example.demo.controller;
// Определение пакета, к которому относится данный контроллер. Это помогает организовать код и структурировать его.
import com.example.demo.model.User;
// Импорт класса User, который используется для работы с данными пользователя.
import org.springframework.stereotype.Controller;
// Импорт аннотации @Controller. Она говорит Spring, что данный класс является контроллером.
import org.springframework.ui.Model;
// Импорт для работы с объектом Model, который позволяет передавать данные между контроллером и представлением.
import org.springframework.web.bind.annotation.*;
// Импорты для работы с аннотациями, такими как @GetMapping, @PostMapping и другими, чтобы обрабатывать HTTP-запросы.
@Controller
// Аннотация, которая сообщает Spring, что данный класс является контроллером.
        public class AuthController {
            // Определение класса-контроллера AuthController, который будет обрабатывать запросы авторизации и регистрации пользователей.
            private User registeredUser;
            // Переменная для хранения информации о зарегистрированном пользователе. По умолчанию равна null.
            private boolean isAuthenticated = false;
            // Переменная-флаг, показывающая, авторизован ли пользователь в данный момент.
            @GetMapping("/")
            // Аннотация для обработки GET-запроса по корневому URL ("/").
            public String showRegisterPage() {
                // Метод, который будет вызываться при GET-запросе по корневому URL.
                return "register";
                // Возвращает название представления (HTML-шаблона) "register", которое отображается пользователю.
            }
            @PostMapping("/register")
            // Аннотация для обработки POST-запроса по URL "/register".
            public String register(@RequestParam String username,
                                   @RequestParam String password, Model model) {
                // Метод обработки данных из формы регистрации.
                if (username.isEmpty() || password.isEmpty()) {
                    // Проверяем, не пустые ли значения имени пользователя и пароля.
                            model.addAttribute("error", "Имя пользователя и пароль не должны быть пустыми!");
                    // Если пустые, отправляем сообщение об ошибке в представление.
                    return "register";
                    // Возвращаемся на страницу регистрации.
                }
                registeredUser = new User(username, password);
                // Создаём нового пользователя с полученными данными и сохраняем в переменную registeredUser.
                return "redirect:/login";
                // Перенаправляем пользователя на страницу входа ("/login").
            }
            @GetMapping("/login")
            // Аннотация для обработки GET-запроса по URL "/login".
            public String showLoginPage() {
                return "login";
                // Возвращает представление (HTML-шаблон) "login".
            }
            @PostMapping("/login")
            // Аннотация для обработки POST-запроса по URL "/login".
            public String login(@RequestParam String username,
                                @RequestParam String password, Model model) {
                // Метод обработки данных из формы входа.
                if (registeredUser == null ||
                        !registeredUser.getUsername().equals(username) ||
                        !registeredUser.getPassword().equals(password)) {
                    // Проверяем, зарегистрирован ли пользователь и совпадают ли данные с формой.
                            model.addAttribute("error", "Неверное имя пользователя или пароль!");
                    // Если данные некорректны, отправляем сообщение об ошибке.
                    return "login";
                    // Возвращаемся на страницу входа.
                }
                isAuthenticated = true;
                // Если данные корректны, устанавливаем флаг авторизации в true.
                return "redirect:/home";
                // Перенаправляем пользователя на домашнюю страницу после успешного входа.
            }
            @GetMapping("/home")
            // Аннотация для обработки GET-запроса по URL "/home".
            public String showHomePage(Model model) {
                if (!isAuthenticated) {
                    // Проверяем, авторизован ли пользователь. Если нет:
                    return "redirect:/login";
                    // Перенаправляем его на страницу входа.
                }
                model.addAttribute("username",
                        registeredUser.getUsername());
                // Если пользователь авторизован, передаём имя пользователя в представление.
                return "home";
                // Возвращаем представление (HTML-шаблон) "home".
            }
            @PostMapping("/home")
            public String convert(@RequestParam double amount, @RequestParam String fromCurrency,
                                  @RequestParam String toCurrency, Model model){

                double result = 0;
                if(fromCurrency.equals("USD") && toCurrency.equals("RUB")){
                    result = amount * 103;
                } else if (fromCurrency.equals("USD") && toCurrency.equals("USD")) {
                    result = amount;
                }else if(fromCurrency.equals("EUR")&& toCurrency.equals("USD")){
                    result = amount*1.04;
                }
                else if(fromCurrency.equals("EUR")&& toCurrency.equals("RUB")){
                    result = amount*109;
                }
                model.addAttribute("conversionResult", result);
                model.addAttribute("amount", amount);
                model.addAttribute("fromCurrency", fromCurrency);
                model.addAttribute("toCurrency", toCurrency);
                return "home";

            }
        }
