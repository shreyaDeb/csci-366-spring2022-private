cmake_minimum_required(VERSION 3.16)
project(366_c_homework C CXX)

# 'lib' is the folder with Google Test sources
add_subdirectory(lib)
include_directories(${gtest_SOURCE_DIR}/include ${gtest_SOURCE_DIR} ../src)

add_executable(c_homework c_homework.cpp)
target_link_libraries(c_homework gtest gtest_main)
