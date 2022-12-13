import { render, screen } from "@testing-library/react";
// import { createRoot, ReactDOM } from "react-dom/client";
import App from "./App";

test("renders learn react link", () => {
  render(<App />);
  const linkElement = screen.getByText("Get Result");
  expect(linkElement).toBeInTheDocument();
});

// it("renders without crashing", () => {
//   const div = document.createElement("div");
//   createRoot(<App />, div);
// });
