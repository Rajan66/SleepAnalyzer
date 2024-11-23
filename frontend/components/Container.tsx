interface ContainerProps {
    children: React.ReactNode;
}

export default function Container({ children }: ContainerProps) {
    return (
        <div className="max-w-[1400px] mx-auto px-4 md:px-10 xl:px-28 h-full">
            {children}
            hei
        </div>
    );
}
