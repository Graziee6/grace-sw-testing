import { render, screen } from "@testing-library/react";
import CalcComponent from "../components/CalcComponent";

test("read the 'operations' label", () => {
  render(<CalcComponent />);
  const opLabel = screen.getByText("Operations:");
  expect(opLabel).toBeInTheDocument();
});

test("find 'op1' textbox", () => {
  render(<CalcComponent />);
  const op1InputElement = screen.getByTestId("op1");
  expect(op1InputElement).toBeInTheDocument();
});

test("find 'op2' textbox", () => {
  render(<CalcComponent />);
  const op2InputElement = screen.getByTestId("op2");
  expect(op2InputElement).toBeInTheDocument();
});
